package Permutation;

public class PermutationOfString {
    public static void main(String[] args) {
        PermutationOfString p = new PermutationOfString();
        p.permutation("abc");
        
    }

    public void permutation(String str) {
        StringPermutation("",str);
    }

    private void StringPermutation(String prefix, String str) {
        for(int i=0; i<str.length(); i++) {
            StringPermutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
        }

        if(str.isEmpty()) {
            System.out.println(prefix);
        }
    }

}
