package com.example.a49

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(numbers: IntArray): IntArray {
                var answer: IntArray = intArrayOf()
                var result = mutableListOf<Int>()

                //서로 다른 인덱스에 있는 두개의 수를 뽑아 더해서 만들수 있는 모든 수
                // 1 1 2 3 4
                var sum = 0
                for(i in 0 ..numbers.size-2){
                    for(j in i+1..numbers.size-1){
                        sum = numbers[i]+numbers[j]
                        if(result.contains(sum)) continue // 값이 있으면 생략
                        result.add(sum)
                    }
                }
                result.sort()
                answer = result.toIntArray()
                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(2,1,3,4,1))
        a.solution(intArrayOf(5,0,2,7))
    }
}