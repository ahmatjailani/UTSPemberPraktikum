package com.example.utspember

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.utspember.databinding.FragmentGridBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GridFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GridFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentGridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGridBinding.inflate(inflater, container, false)
        val list = ArrayList<DataPemain>()

        list.addAll(
            arrayOf(
                DataPemain("Anthony Sinisuka Ginting", "26 Tahun", R.drawable.ginting),
                DataPemain("Jonatan Christie", "24 Tahun", R.drawable.jonatan),
                DataPemain("Marcus Fernaldi Gideon", "30 Tahun", R.drawable.marcus),
                DataPemain("Kevin Sanjaya Sukamuljo", "26 Tahun", R.drawable.kevin),
                DataPemain("Mohammad Ahsan", "34 Tahun", R.drawable.ahsan),
                DataPemain("Hendra Setiawan", "37 Tahun", R.drawable.hendra),
                DataPemain("Fajar Alfian", "23 Tahun", R.drawable.fajar),
                DataPemain("Muhammad Rian Ardianto", "23 Tahun", R.drawable.rian),
                DataPemain("Greysia Polii ", "33 Tahun", R.drawable.greysia),
                DataPemain("Apriyani Rahayu", "23 Tahun", R.drawable.rahayu),
                DataPemain("Gregoria Mariska Tunjung", "22 Tahun", R.drawable.mariska),
                DataPemain("Fitriani", "24 Tahun", R.drawable.fitriani),
                DataPemain("Bellaetrix Manuputty", "27 Tahun", R.drawable.manuputty),
                DataPemain("Della Destiara Haris", "23 Tahun", R.drawable.della),
                DataPemain("Ruselli Hartawan", "24 Tahun", R.drawable.ruselli),
                DataPemain("Shesar Hiren Rhustavito", "23 Tahun", R.drawable.hiren),
                DataPemain("Chico Aura Dwi Wardoyo", "22 Tahun", R.drawable.aura),
                DataPemain("Leo Rolly Carnando", "20 Tahun", R.drawable.leo),
                DataPemain("Daniel Marthin", "21 Tahun", R.drawable.daniel),
                DataPemain("Rehan Naufal Kusharjanto", "20 Tahun", R.drawable.rehan)
            )
        )


        val myAdapter = GridAdapter(list)

        binding.recycleGridView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recycleGridView.setHasFixedSize(true)
        binding.recycleGridView.adapter = myAdapter

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GridFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GridFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}