package com.example.epoxyexampleapp

import android.os.Bundle
import android.util.Log
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
                id("activity-id")
                text("Activities")
            }
            // Carousel Item
            val carouselItemModels = listOf(0, 1, 2, 3, 4, 5).map { currentItem ->

                TaskCarouselModel_().id(currentItem).text("Hello World")
            }
            // Carousel
            // This extension function come with epoxy
            carousel {

                id("car")
                hasFixedSize(true)
                models(carouselItemModels)

            }
            itemTitle {
                id("task-id")
                text("Tasks")
            }
            // Task title
            // item_title.xml


            val itemModels = listOf(0, 1, 2, 34, 5, 6).map { item ->
                ItemTaskModel_().id(item).title("Task $item").description("A lot of work")

            }

            carousel {
                id("Task found")
                models(itemModels)
            }
            itemTitle {
                id("Contact Details")
                text("Contact Details")
            }
         val username=  ItemTextField_().id("Hello").hint("Username")
            username.addTo(this)
            val password = ItemPasswordModel_().id("password").hint("Password")
            password.addTo(this)

            val dropdown = ItemDropDownModel_().id("gender").addTo(this)

            itemButton {
                id("button")
                label("Login")
                listener { _ ->
                    Log.d("Gondai",username.getText()+password.getText())

                }

            }

            itemContact {
                id("Contact stuff")
                fax("+27 64 690 6565")
                email("gondaimgano@gmail.com")
                mobile("0772 235 083")
            }

            itemTitle {
                id("task-id")
                text("Overview")
            }
            // Task title
            // item_title.xml

            val itemModels1 = listOf(0, 1, 2, 34, 5, 6).map { item ->
                ItemTaskModel_().id(item).title("Task $item").description("A lot of work")

            }

            carousel {
                id("Task found")
                models(itemModels1)
            }
        // Tasks
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}