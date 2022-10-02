package com.example.linkedinlite.ui.home

import com.example.linkedinlite.R

class HomeDataSource {
    fun loadData() : List<homeData> {
        return listOf<homeData>(
            homeData("This is a snippet of a countdown video, Which I made for Techniche IITG", R.drawable.image_1),
            homeData("This is also a still render of countdown video for Techniche.", R.drawable.image_2),
            homeData("A render from a video I made on Earth Hour.", R.drawable.image_3),
            homeData("A cute robot I modelled for a Problem Statement.", R.drawable.image_4),
            homeData("Another day, another countdown", R.drawable.image_5),



        )
    }
}