import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
    
        
        int MaxSelect = nums.length / 2;
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
       
        for (int num : nums) {
            // .getOrDefault(K key, V defaultValue) 메서드
            // key: 값을 검색할 키.
            // defaultValue: 해당 키가 존재하지 않을 때 반환할 기본값.
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int Types = countMap.size();
        
        answer = Math.min(Types, MaxSelect);
        
        return answer;
        
    }
}