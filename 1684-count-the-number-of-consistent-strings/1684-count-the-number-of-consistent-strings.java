class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ao=0;
        for(String a:words)
        {
            for(char i:a.toCharArray())
            {
                if(allowed.indexOf(i)==-1)
                {
                    ao++;
                    break;
                }
            }
        }
        return words.length-ao;
    }
}