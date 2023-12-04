import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maenson.choice.uicotlinpractice_maenson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewBinding 인스턴스 생성
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding 초기화
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // contentEdt 버튼에 대한 이벤트 처리
        binding.contentEdt.setOnClickListener {
            // 여기에 버튼 클릭 시 수행할 동작을 추가하세요
        }
    }
}
