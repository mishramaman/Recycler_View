package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var empList:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        empList=findViewById(R.id.EmployeeName)
        val empName= listOf<String>("Aman","Arpit sir","Tanuj sir","Rajesh Sir","Ashutosh sir","Saurabh Prajapati","Aman","Arpit sir","Tanuj sir","Rajesh Sir","Ashutosh sir","Saurabh Prajapati","Aman","Arpit sir","Tanuj sir","Rajesh Sir","Ashutosh sir","Saurabh Prajapati")
        val empDes= listOf<String>("Trainee Engineer","Trainee Engineer","Tea Lead","Team Lead","Software Engineer","Test Engineer","Trainee Engineer","Trainee Engineer","Tea Lead","Team Lead","Software Engineer","Test Engineer","Trainee Engineer","Trainee Engineer","Tea Lead","Team Lead","Software Engineer","Test Engineer","Trainee Engineer","Trainee Engineer","Tea Lead","Team Lead","Software Engineer","Test Engineer")
        empList.adapter=MyAdapter(empName,empDes)
        empList.layoutManager=LinearLayoutManager(this)
    }
}