package com.example.linkedinlite.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedinlite.R
import com.example.linkedinlite.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val myDataset = HomeDataSource().loadData()
        val recyclerView = root.findViewById<RecyclerView>(R.id.postRecycler)
        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager
        val adapter = HomeAdapter(myDataset)
        recyclerView.adapter = adapter
        recyclerView.itemAnimator = DefaultItemAnimator()


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}