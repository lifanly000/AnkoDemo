package sleep.sunshine.com.ankodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
        verticalLayout {
            padding = dip(30)
            var name = editText{
                hint = "Name"
                textSize = 24f
            }
            var password = editText {
                hint = "password"
                textSize = 24f
            }
            button("Login") {
                textSize = 24f

                onClick {
                    login(name.text.toString(),password.text.toString())

                }
            }
        }
    }

    fun  login(text: String?, text1: String?){
        Toast.makeText(this@SecondActivity,text+text1,Toast.LENGTH_SHORT).show()
    }
}
