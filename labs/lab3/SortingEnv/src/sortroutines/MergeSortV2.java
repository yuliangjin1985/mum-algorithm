package sortroutines;

//MergeSort is not inversion bound, that means the number of comparison is is smaller than that of the inversion
public class MergeSortV2 {
  public int[] merge(int[] s1, int[] s2) {

    int len1 = s1.length;
    int len2 = s2.length;
    int i=0, j=0, index = 0;
    int[] ints = new int[len1 + len2];

    while(i<len1 && j<len2) {
      if(s1[i] < s2[j]) {
        ints[index++] = s1[i++];
      } else {
        ints[index++] = s2[j++];
      }
    }

    while(i < len1) {
      ints[index++] = s1[i++];
    }

    while (j < len2) {
      ints[index++] = s2[j++];
    }
    return ints;
  }

  public int[] mergeSort(int[] seq) {
    if(seq.length > 1) {

      int mid = (seq.length/2);
      int[] s1 = new int[mid];
      int[] s2 = new int[seq.length - mid];


      for(int i=0;i<s1.length;i++) {
        s1[i] = seq[i];
      }
      for(int i=mid, j=0;i<seq.length;i++) {
        s2[j++] = seq[i];
      }
      int[] mergeSort1 = mergeSort(s1);
      int[] mergeSort2 = mergeSort(s2);

      seq = merge(mergeSort1, mergeSort2);
    }
    return seq;
  }

  public static void main(String[] args) {
    int[] ints = new MergeSortV2().mergeSort(new int[]{3, 4, 5, 9, 1, 0, -9, 30});
    for (int anInt : ints) {
      System.out.print(anInt + " ");
    }
  }
}
