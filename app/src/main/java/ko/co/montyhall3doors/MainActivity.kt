package ko.co.montyhall3doors

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var i: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Selectdoor: String

        val first_rnds = (0..2).random()
        print("$first_rnds" + "입니다")

        when (first_rnds) {
            0 -> {
                img_door1_back.setImageResource(R.drawable.supercar_64)
                img_door1_back.visibility = View.GONE

            }
            1 -> {
                img_door2_back.setImageResource(R.drawable.supercar_64)
                img_door2_back.visibility = View.GONE
            }
            else -> {
                img_door3_back.setImageResource(R.drawable.supercar_64)
                img_door3_back.visibility = View.GONE

            }

        }
        btn_event()
    }



    fun btn_event() {
        btn_next.setOnClickListener {

            if (firstQuestion.visibility == View.VISIBLE) {
                firstQuestion.visibility = View.GONE
                SecondQuestion.visibility = View.VISIBLE
            }
        }

    }


}




