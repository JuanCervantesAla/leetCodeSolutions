class Solution {
    public String defangIPaddr(String address) {

        ArrayList<Character> lista = new ArrayList<>();

        int counter = 0 ;
        while(counter < address.length()){

            if( !(address.charAt(counter) == '.') ){
                lista.add( address.charAt(counter) );

            } else {
                lista.add('[');
                lista.add( address.charAt(counter));
                lista.add(']');
            }

            counter++;

        }

        String result="";
        counter = 0;
        while(counter < lista.size() ){
            result += lista.get(counter);
            counter++;
        }

        return result;

    }
}
