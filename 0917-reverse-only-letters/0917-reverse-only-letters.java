class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            if(Character.isLetter(a[i]))
            {
                if(Character.isLetter(a[j]))
                {
                    if(i<j)
                    {
                        char temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        i++;
                        j--;
                    }
                }
                else{
                    j--;
                }
            }
            else
            {
                i++;
            }
        }
        return new String(a);
    }
}