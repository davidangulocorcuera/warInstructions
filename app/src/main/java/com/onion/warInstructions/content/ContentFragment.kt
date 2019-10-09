package com.onion.warInstructions.content



import android.view.View
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.onion.warInstructions.R
import com.onion.warInstructions.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_content.*

class ContentFragment : BaseFragment() {
    private var paragraphs: ArrayList<String> = ArrayList()
    private lateinit var contentAdapter: ContentAdapter
    private val args: ContentFragmentArgs by this.navArgs()

    override fun onCreateViewId(): Int {
        return R.layout.fragment_content
    }

    override fun viewCreated(view: View?) {
        initList()
        setToolbarTitle(args.title)
        if(paragraphs.isEmpty()){
            paragraphs = ArrayList(args.paragraphs.toList())
            contentAdapter.addAll(paragraphs)
        }

    }

    private fun initList() {
        val layoutManager = GridLayoutManager(activity, 1)
        rvContent.layoutManager = layoutManager
        contentAdapter = ContentAdapter(activity = activity!! , items = paragraphs)
        rvContent.adapter = contentAdapter
    }


}
