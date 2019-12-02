package com.cloudfy.warInstructions.content


import android.view.View
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.content.adapter.ContentAdapter
import kotlinx.android.synthetic.main.fragment_content.*

class ContentFragment : BaseFragment(), ContentView {
    override fun addParagraphs(paragraphs: ArrayList<String>) {
        contentAdapter.addAll(paragraphs)
    }

    private var paragraphs: ArrayList<String> = ArrayList()
    private lateinit var contentAdapter: ContentAdapter
    private val args: ContentFragmentArgs by this.navArgs()
    private val presenter: ContentPresenter by lazy { ContentPresenter(this) }

    override fun onCreateViewId(): Int {
        return R.layout.fragment_content
    }

    override fun viewCreated(view: View?) {
        initList()
        setToolbarTitle(args.title)
        if (paragraphs.isEmpty()) {
            presenter.getData(args)
        }
    }

    private fun initList() {
        val layoutManager = LinearLayoutManager(context)
        rvContent.layoutManager = layoutManager
        rvContent.setHasFixedSize(true)
        contentAdapter = ContentAdapter(
            activity = activity!!,
            items = paragraphs
        )
        rvContent.adapter = contentAdapter
    }


}
