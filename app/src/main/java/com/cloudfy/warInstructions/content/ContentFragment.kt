package com.cloudfy.warInstructions.content



import android.view.View
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Paragraph
import kotlinx.android.synthetic.main.fragment_content.*
import kotlinx.android.synthetic.main.fragment_sub_index.*

class ContentFragment : BaseFragment() {
    private var paragraphs: ArrayList<Paragraph> = ArrayList()
    private lateinit var contentAdapter: ContentAdapter
    private val args: ContentFragmentArgs by navArgs()

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
