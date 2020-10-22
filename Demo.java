public class Demo {
  public static void main(String[] args) {
    // if (args.length == 0) {
    //   printLoop(5);
    // } else {
    //   printLoop(Integer.parseInt(args[0]));
    // }

    //10-22-20
    int[] a = {0,3,2};
    int[] b = {};
    int[] c = {1238013};
    int[] d = {54,3512,4672,4,5,6,2};
    int[] e = {7,2,9,3,3,423};
    int[][] f = {a,b,c,d,e};
    System.out.println(arrToString(a));
    // for (int i = 0; i < f.length; i++) {
    //   System.out.println(arrToString(f[i]));
    // }
    System.out.print(arrayDeepToString(f));
  }

  public static void printLoop(int n){
      for(int i = 1; i <= n; i++){
        for(int j = i; j <= n; j++){
           System.out.print(i);
        }
        System.out.println();
      }
    }


    //10-22-20 HW
    public static String arrToString(int[] arr){
      String ans = "{";
      if (arr.length>0) {
        ans += Integer.toString(arr[0]);
        for (int i = 1; i < arr.length; i++) {
          ans += ", " + Integer.toString(arr[i]);
        }
      }
      ans += "}";
      return ans;
    }

    public static String arrayDeepToString(int[][] arr) {
      String ans = "{";
      if (arr.length>0) {
        for (int i = 0; i < arr.length-1; i++) {
          ans += arrToString(arr[i]) + ", ";
        }
        ans += arrToString(arr[arr.length-1]) + "}";
    }
    return ans;
  }
  
  
}
