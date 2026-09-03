class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> a=new ArrayList<>();
        for(int i=1;i<=searchWord.length();i++)
        {
            List<String> a1=new ArrayList<>();
            for(int j=0;j<products.length;j++)
            {
                if(products[j].length()>=i && searchWord.substring(0,i).equals(products[j].substring(0,i)) && a1.size()<3)
                {
                    a1.add(products[j]);
                }
            }
            a.add(a1);
        }
        return a;
    }
}