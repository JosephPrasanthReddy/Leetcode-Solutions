class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> hs = new HashSet<>();
        for (String s : wordlist) {
            hs.add(s);
        }
        HashMap<String, String> hs2 = new HashMap<>();
        for (String s : wordlist) {
            hs2.putIfAbsent(s.toUpperCase(), s);
        }
        HashMap<String, String> hs3 = new HashMap<>();
        for (String s : wordlist) {
            String y = s.toLowerCase();
            y = y.replace('a', '*');
            y = y.replace('e', '*');
            y = y.replace('i', '*');
            y = y.replace('o', '*');
            y = y.replace('u', '*');
            hs3.putIfAbsent(y, s);
        }
        String a[] = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String s = queries[i];
            if (hs.contains(s)) {
                a[i] = s;
            }
            else if (hs2.containsKey(s.toUpperCase())) {
                a[i] = hs2.get(s.toUpperCase());
            }

            else {

                String y = s.toLowerCase();

                y = y.replace('a', '*');
                y = y.replace('e', '*');
                y = y.replace('i', '*');
                y = y.replace('o', '*');
                y = y.replace('u', '*');

                if (hs3.containsKey(y)) {
                    a[i] = hs3.get(y);
                }
                else {
                    a[i] = "";
                }
            }
        }
        return a;
    }
}