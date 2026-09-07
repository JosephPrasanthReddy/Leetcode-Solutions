class Solution {
    public int takeCharacters(String s, int k) {
        int total[]=new int[3];
        for(char i:s.toCharArray())
        {
            total[i-'a']++;
        }
        if(total[0]<k || total[1]<k ||total[2]<k)
        {
            return -1;
        }
        int window[]=new int[3];
        int l=0;
        int a=0;
        for(int r=0;r<s.length();r++)
        {
            window[s.charAt(r)-'a']++;
            while(window[0]>total[0]-k || window[1]>total[1]-k || window[2]>total[2]-k)
            {
                window[s.charAt(l)-'a']--;
                l++;
            }
            a=Math.max(r-l+1,a);
        }
        return s.length()-a;
    }
}