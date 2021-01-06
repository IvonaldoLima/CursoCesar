package com.example.cesarcusrsoandroidalarmmanager

import android.app.AlertDialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

open class AlarmReceiver : BroadcastReceiver(){

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("IPL", "Mostrar toast")
//        Toast.makeText(context, "Alarme executado", Toast.LENGTH_LONG).show()


        val builder = AlertDialog.Builder(context)
        //set title for alert dialog
        builder.setTitle("Titulo")
        //set message for alert dialog
        builder.setMessage("Alarme executado")
       // builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes"){dialogInterface, which ->
           // Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
        }
        //performing cancel action
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
           // Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
        }
        //performing negative action
        builder.setNegativeButton("No"){dialogInterface, which ->
          //  Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}