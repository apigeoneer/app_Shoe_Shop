package com.gmail.apigeoneer.shoeshop.ui.overview

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.gmail.apigeoneer.shoeshop.R
import com.gmail.apigeoneer.shoeshop.databinding.FragmentShoeListBinding
import com.gmail.apigeoneer.shoeshop.databinding.ShoeItemBinding
import com.gmail.apigeoneer.shoeshop.viewmodels.ShoeListViewModel


class ShoeListFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentShoeListBinding

    // Use the 'by activityViewModels()' Kotlin property delegate
    // from the fragment-ktx artifact
    private val shoeListViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_shoe_list, container, false
        )

        /**
         * The ShoeListFragment needs to observe the shoeList LiveData,
         * in order to update the UI accordingly
         */
        shoeListViewModel.shoeList.observe(viewLifecycleOwner, Observer {

            for (shoe in shoeListViewModel.shoeList.value!!) {
                // inflate the shoe list item
                val shoeListItem: ShoeItemBinding=DataBindingUtil.inflate(
                    inflater,
                    R.layout.shoe_item, container, false
                )
                shoeListItem.newShoeData=shoe
                binding.shoeListLl.addView(shoeListItem.root)

                if (shoeListViewModel.shoeList.value!!.isNotEmpty()) {
                    binding.emptyTv.visibility=View.GONE
                    binding.emptyIv.visibility=View.GONE
                }
            }
        })

        binding.fab.setOnClickListener {
            it.findNavController().navigate(R.id.action_shoeListFragment_to_detailFragment)
        }

        val toolbar=binding.toolbar
        (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)
        toolbar.title=null

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                shoeListViewModel.cancelAddingShoe()
                findNavController().navigate(R.id.action_shoeListFragment_to_loginFragment)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}