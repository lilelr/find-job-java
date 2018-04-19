import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Main().doString("aavaafaefe");
    }

    public void doString(String input){
        char[] chars = input.toCharArray();
        ArrayList<String> lists =new ArrayList<>();
        TreeSet set = new TreeSet();

        for(int i=0;i<chars.length;i++){
            lists.add(String.valueOf(chars[i]));
            set.add(String.valueOf(chars[i]));
        }

        System.out.println(set);
        Collections.sort(lists);
        System.out.println(lists);

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<lists.size();i++){
            sb.append(lists.get(i));
        }

        input = sb.toString();
        System.out.println(input);
        int max = 0;
        String maxString = "";
        ArrayList<String> max_list = new ArrayList<>();

        Iterator its = set.iterator();
        while (its.hasNext()){
            String os = (String) its.next();
            int begin = input.indexOf(os);
            int end = input.lastIndexOf(os);
            int value = end - begin +1;
            if(value > max){
                max = value;
                maxString = os;
                max_list.add(os);
            }else if(value == max){
                max_list.add(os);
            }
        }

        int index = 0;
        for(int i=0;i<max_list.size();i++){
            if(max_list.get(i).equals(maxString)){
                index = i;
                break;
            }
        }

        System.out.println("max data");

        for(int i=index;i<max_list.size();i++){
            System.out.println(max_list.get(i)+ " ");
        }
        System.out.println();
        System.out.println("max "+ max);
    }
}
