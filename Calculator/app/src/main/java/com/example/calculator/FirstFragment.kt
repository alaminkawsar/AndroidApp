package com.example.calculator

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.calculator.databinding.FragmentFirstBinding

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
        view.findViewById<Button>(R.id.equal).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            var num = numCount.text.toString()
            //operation.................................................
        }
        var str: String = ""
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "1" else numCount.text = numCount.text.toString()+"1"
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "2" else numCount.text = numCount.text.toString()+"2"
        }
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "3" else numCount.text = numCount.text.toString()+"3"
        }
        view.findViewById<Button>(R.id.button4).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "4" else numCount.text = numCount.text.toString()+"4"
        }
        view.findViewById<Button>(R.id.button5).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "5" else numCount.text = numCount.text.toString()+"5"
        }
        view.findViewById<Button>(R.id.button6).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "6" else numCount.text = numCount.text.toString()+"6"
        }
        view.findViewById<Button>(R.id.button7).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "7" else numCount.text = numCount.text.toString()+"7"
        }
        view.findViewById<Button>(R.id.button8).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "8" else numCount.text = numCount.text.toString()+"8"
        }
        view.findViewById<Button>(R.id.button9).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "9" else numCount.text = numCount.text.toString()+"9"
        }
        view.findViewById<Button>(R.id.button0).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "0" else numCount.text = numCount.text.toString()+"0"
        }
        view.findViewById<Button>(R.id.plus).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "0" else numCount.text = numCount.text.toString()+"+"
        }
        view.findViewById<Button>(R.id.dot).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "0" else numCount.text = numCount.text.toString()+"."
        }
        view.findViewById<Button>(R.id.division).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "0" else numCount.text = numCount.text.toString()+"÷"
        }
        view.findViewById<Button>(R.id.multiply).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "0" else numCount.text = numCount.text.toString()+"x"
        }
        view.findViewById<Button>(R.id.minus).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            if(numCount.text.toString()=="0") numCount.text = "0" else numCount.text = numCount.text.toString()+"-"
        }
        view.findViewById<Button>(R.id.del).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            numCount.text = numCount.text.toString()
            var p: String = numCount.text.toString()
            if(p.length>2) p = p.substring(0..p.length-2)
            else p = "0"
            numCount.text = p
        }
        view.findViewById<Button>(R.id.ac).setOnClickListener {
            val numCount = view.findViewById<TextView>(R.id.text_box)
            numCount.text = "0"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}