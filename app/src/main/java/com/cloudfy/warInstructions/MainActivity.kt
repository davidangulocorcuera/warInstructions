package com.cloudfy.warInstructions

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.database.ChaptersDatabase
import com.cloudfy.warInstructions.home.HomeFragmentArgs
import com.cloudfy.warInstructions.home.HomeFragmentDirections
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val mainViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel()::class.java)
    }

    override fun onCreateViewId(): Int {
        return R.layout.activity_main
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel.chaptersResponse.observe(this, Observer { chapters ->
            chapters?.let {
                loadNavigationGraph(it)
            }
        })
        mainViewModel.getAllChapters(application, this)
    }

    private fun loadNavigationGraph(chapters: ArrayList<Chapter>){
        val navHostFragment = navFragment as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        val graph = inflater.inflate(R.navigation.main_graph)
        val bundle = Bundle()
        bundle.putParcelableArray("chapters" ,chapters.toTypedArray())
        findNavController(R.id.navFragment).setGraph(graph,bundle)

    }


}
