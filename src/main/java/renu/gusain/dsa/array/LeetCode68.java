package renu.gusain.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode68 {
    public static void main(String[] args) {
        String ip[]={"This", "is", "an", "example", "of", "text", "justification."};
        List<String>op=fullJustify(ip,16);
        for(int i=0;i<op.size();i++)
        {
        //    System.out.println(op.get(i));
        }

    }
    public  static  List<String> fullJustify(String[] words, int maxWidth) {

        final int len = words.length;
        List<String> result = new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>();
        for (int i = 0; i < len; ) {
            int lenSoFar = 0;
            List<String> op = new ArrayList<>();
            while (lenSoFar <= maxWidth && i < len) {
                String currenWord = words[i];
                int currentLen = currenWord.length();
                if (currentLen + lenSoFar <= maxWidth) {
                    op.add(currenWord);
                    lenSoFar = currentLen + lenSoFar + 1;//1 for space;
                    i = i + 1;
                }
                else
                {
                    break;
                }

            }
            resultList.add(op);



        }
        for(int i=0;i<resultList.size()-1;i++)
        {
            result.add(adjust(resultList.get(i),maxWidth));

        }
        result.add(leftAdjust(resultList.get(resultList.size()-1),maxWidth));
        return result;

    }

    private static String leftAdjust(List<String> op, int maxSize) {
       // System.out.println("LeftJustify");

        int totalLen = op.stream().mapToInt(c -> c.length()).sum();
        int leftSpace = maxSize - totalLen;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < op.size() - 1; i++) {
            String currentWord = op.get(i);
            sb.append(currentWord).append(" ");
            leftSpace--;
        }
        sb.append(op.get(op.size() - 1));
        for (int i = 0; i < leftSpace; i++) {
            sb.append(" ");
        }
        //System.out.println(sb.toString());

        return sb.toString();

    }

    private  static String adjust(List<String> op, int maxSize) {
     //   System.out.println("justt");
        int spaceCount = op.size() - 1;

        int totlWordCount = op.stream().mapToInt(c -> c.length()).sum();




        StringBuilder sb = new StringBuilder();
        if (spaceCount == 0) {
            sb.append(op.get(op.size() - 1));
            for (int i = 0; i < maxSize - totlWordCount; i++) {
                sb.append(" ");
            }
          //  System.out.println(sb.toString());

            return sb.toString();



        }
        int allocatedSpace = (maxSize - totlWordCount) / spaceCount;
        int remaining = (maxSize - totlWordCount) % spaceCount;
        for (int i = 0; i < op.size() - 1; i++) {
            String currentWord = op.get(i);
            sb.append(currentWord);

            for (int j = 0; j < allocatedSpace; j++) {
                sb.append(" ");

            }
            if (remaining > 0) {
                sb.append(" ");
                remaining--;
            }


        }
        sb.append(op.get(op.size() - 1));
       // System.out.println(sb.toString());
        return sb.toString();


    }
}
