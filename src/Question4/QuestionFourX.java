
// The final result for Qustion 4.

class QuestionFourX {
    public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("ABC");
      permutation(sb);
    }

    static void permutation(StringBuilder sb) {
      permutation(sb, 0);
    }

    static void permutation(StringBuilder sb, int position) {
      if (sb.length() - position == 1) {
        System.out.println(sb);
      } else {
        for (int i = position; i < sb.length(); i++) {
          swap(sb, position, i);
          permutation(sb, position+1);
          swap(sb, position, i);
        }
      }
    }

    static void swap(StringBuilder sb, int position1, int position2) {
      char temp = sb.charAt(position1);
      sb.setCharAt(position1, sb.charAt(position2));
      sb.setCharAt(position2, temp);
    }
}
