package com.example.epoxyexampleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.epoxy.carousel
import com.example.epoxyexampleapp.components.*
import com.example.epoxyexampleapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding?.mainLayoutView?.withModels {

            itemTitle {
                id("fish")
                text("Fish")
            }
            // Carousel Item
            val carouselItemModels = listOf(0,1,2,3,4,5).map { currentItem ->

                  TaskCarouselModel_().id(currentItem).text("Hello World")
            }

            // Carousel
            // This extension function come with epoxy
            carousel {
                id("car")
               models(carouselItemModels)
            }




            itemTitle {
                id("fish")
                text("Fish")
            }
            // Task title
            // item_title.xml

               listOf(0,1,2,34,5,6).forEach {
                   taskCarousel {
                       id(it)
                       text("Task $it")

                   }
               }
            // Tasks

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}