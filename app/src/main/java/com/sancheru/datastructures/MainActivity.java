package com.sancheru.datastructures;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view);
        Button mButton = findViewById(R.id.button);
        mEditText = findViewById(R.id.edit_text);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Validate the editetxt is palindrome or not

                boolean validate = validatePalindrome(mEditText.getText().toString().trim());
                //server api boolean

                if (validate) {
                    mTextView.setText("Validated and Palindrome");
                } else {
                    mTextView.setText("Validated and not a Palindrome");
                }

            }
        });

        //interSectionOfTwoArrays(new int[]{1, 3, 4, 5, 7}, new int[]{2, 3, 5, 6});
        ///unionOfTwoArrays(new int[]{1, 3, 4, 5, 7}, new int[]{2, 3, 5, 6});
        //unionOfTwoDuplicateArrays(new int[]{1, 2, 2, 2, 3}, new int[]{2, 3, 4, 5});
        //findMissingElementInAnArray(new int[]{1, 2, 4, 6, 3, 7, 8});
        //Log.e("MainAc", "" + findMissingElementInAnArray(new int[]{1, 2, 4, 6, 3, 7, 8}));
        //Log.e("MainAc", "" + minimumDistanceBetweenTwoNumbers(new int[]{2, 5, 3, 5, 4, 4, 2, 3}, 3, 2));
        //checkMaxOneOdd(buildCharFrequencyTable("joseph"));
        //Log.e("MainAc", "" + uniqueChar("jooseph"));
        //Log.e("MainAc", "" + checkPermutation("dog", "god"));
        //Log.e("MainAc", "" + numberOfPaths(3,3));
        int[] arr = {1, 2, 4, 6, -3, 7, 8};
        //String[] s1 = {"cats", "dog", "sand", "and", "cat"};
        /*String[] s1 = {"apple", "pen"};
        List<String> wordDict = new ArrayList<>();
        wordDict.add(Arrays.toString(s1));*/
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        List<String> wordDict1 = Arrays.asList("apple", "pen");

        //segregate0and1(arr, arr.length);
        //Log.e("MainAc", "" + Arrays.toString(arr));
        //Log.e("MainAc", "" + sumInArray(arr, arr.length, -3));
        //Log.e("MainAc", "" + wordBreak1("catsanddog", wordDict, ""));
        int[] arr1 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        //segregate012(arr1, arr1.length);
        //Log.e("MainAc", "" + Arrays.toString(arr1));
        //wordBreak1("catsanddog", wordDict, "");
        //Log.e("MainAc", "" + wordBreak1("applepenapple", wordDict1));
        //check(new int[]{1221}, 4);

        int[] c = {0, 0, 1, 0, 0, 1, 0};
        //jumpingOnClouds(c, c.length);
        String a = new String("DDUUDDUDUUUD");
        //countingValleys(a.length(), a);
        int[] s = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] r = {1, 2, 3, 4, 5};
        int[] q = {1, 2, 5, 3, 4, 7, 8, 6};

        int[][] mat = {
                {1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}
        };
        //findMaxSum(mat);
        //sockMerchant(s.length, s);
        //rotLeft(r, 2, r.length);
        //minimumBribes(q);
        int[] minSwaps = {4, 3, 1, 2};
        int[] minBribs = {2, 1, 5, 3, 4};
        //minimumSwaps(minSwaps);
        //minimumBribes(minBribs);
        //String result = twoStringsEffieinet("HE", "WORLD");
        String[] s1 = {"give", "me", "one", "grand", "today", "night"};
        String[] s2 = {"give", "one", "grand", "night"};

        String[] s3 = {"two", "times", "times", "three", "is", "not", "four"};
        String[] s4 = {"two", "times", "two", "is", "four"};

        //String result = checkMagazine(s3, s4);
        //System.out.println(result);

        List<Long> longArray = new ArrayList<>();
        longArray.add(1L);
        longArray.add(3L);
        longArray.add(9L);
        longArray.add(9L);
        longArray.add(27L);
        longArray.add(81L);

        //countTriplets(longArray, 3);
        //sherlockAndAnagrams("cdcd");
        String validStingorNot = "()()()()";
        isValid(validStingorNot);

    }

    /**
     * Method to check the given String is Palindrome or not
     *
     * @param text given input
     * @return boolean value represents given string is Palindrome or not
     */
    private boolean validatePalindrome(String text) {
        if (text.isEmpty())
            return false;

        int size = text.length();
        int i = 0, j = size - 1;

        while (i < j) {
            if (text.charAt(i) == text.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    /*Input : a1[] = {1, 3, 4, 5, 7}
    a2[] = {2, 3, 5, 6}*/
    private void interSectionOfTwoArrays(int[] a1, int[] a2) {
        int m = a1.length, n = a2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a1[i] < a2[j]) {//1<2
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                Log.e("MainAc", "" + a1[i]);
                i++;
                j++;
            }
        }
    }

    /*Input : a1[] = {1, 3, 4, 5, 7}
    a2[] = {2, 3, 5, 6}
    Output : Union : {1, 2, 3, 4, 5, 6, 7}
    */
    private void unionOfTwoArrays(int[] a1, int[] a2) {
        int m = a1.length, n = a2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (a1[i] < a2[j]) {//1<2
                Log.e("MainAc", "" + a1[i++]);
            } else if (a1[i] > a2[j]) {
                Log.e("MainAc", "" + a2[j++]);
            } else {
                Log.e("MainAc", "" + a1[i++]);
                j++;
            }
        }

        /* Print remaining elements of   the larger array */
        while (i < m) {
            Log.e("MainAc", "" + a1[i++]);
        }
        while (j < n) {
            Log.e("MainAc", "" + a2[j++]);
        }
    }

    /*Input : a1[] = {1,1, 3, 4, 5, 7}
    a2[] = {2, 2, 3, 5, 6}
    Output : Union : {1, 2, 3, 4, 5, 6, 7}
    // sorted arrays (Handling Duplicates)
    */
    private void unionOfTwoDuplicateArrays(int[] a1, int[] a2) {
        // Taking max element present in either array
        int m = a1[a1.length - 1], n = a2[a2.length - 1];

        //int i = 0, j = 0;
        int ans = 0;

        if (m > n) {
            ans = m;
        } else
            ans = n;

        //Boolean newTable it has 0/1
        int[] newTable = new int[ans + 1];

        // First element is always
        // present in final answer
        //System.out.print(a1[0]);
        Log.e("MainAc", a1[0] + " ");

        // Incrementing the First element's count
        // in it's corresponding index in newtable
        ++newTable[a1[0]];

        // Starting traversing the first
        // array from 1st index till last
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] != a1[i - 1]) {
                //System.out.print(a1[i] + " ");
                Log.e("MainAc", a1[i] + " ");
                ++newTable[a1[i]];
            }
        }
        // Finding only non common
        // elements from 2nd array

        for (int j = 0; j < a2.length; j++) {
            // By checking whether it's already
            // present in newtable or not
            if (newTable[a2[j]] == 0) {
                //System.out.print(a2[j] + " ");
                Log.e("MainAc", a2[j] + " ");
                ++newTable[a2[j]];
            }
        }
    }

    /*Input: arr[] = {1, 2, 4,, 6, 3, 7, 8}
    Output: 5*/
    //Doing XOR operations on n and given array
    private int findMissingElementInAnArray(int[] array) {
        int x1 = array[0];
        int x2 = 1;

        /* For xor of all the elements
           in array */
        for (int i = 1; i < array.length; i++) {
            x1 = x1 ^ array[i];
        }

         /*For xor of all the elements
           from 1 to n+1 */
        for (int i = 2; i <= array.length + 1; i++) {
            x2 = x2 ^ i;
        }

        return (x1 ^ x2);

        /*//Using Some n natiural nubers
        int n = array.length;
        int total = (n + 1) * (n + 2) / 2;

        for (int value : array) {
            total = total - value;

        }
        return total;*/
    }

    /*
     * Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
     *
     * Output: Minimum distance between 3 and 2 is 1.*/
    private int minimumDistanceBetweenTwoNumbers(int[] array, int x, int y) {
        int n = array.length;
        int min_dist = Integer.MAX_VALUE;

        //O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((array[i] == x && array[j] == y || array[i] == y && array[j] == x) && min_dist > Math.abs(i - j)) {
                    min_dist = Math.abs(i - j);
                }
            }
        }

        return min_dist;
    }

    /*Couunt how many times each Char appears*/
    private int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : phrase.toCharArray()) {
            int x = getCharnumber(c);
            if (table[x] != -1) {
                table[x]++;
            }
        }

        return table;
    }

    /*Map each char to number ex: a->0, b->1, c->2
    Non-letter characters map to -1. */
    private int getCharnumber(char c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }

    /*Then, we iterate through the hash table and ensure that no more than one character has
    an odd count.*/
    private boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int value : table) {
            if (value % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private boolean uniqueChar(String phrase) {
        return true;
    }

    /*Check Permutation*/
    private boolean checkPermutation(String phrase1, String phrase2) {
        return sort(phrase1).equals(sort(phrase2));
    }

    String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    /*anana*/
    private void check(int[] array, int size) {
        /*for (int i = 0; i < size; i++) {
            for (int j = size; j > 0; j--) {
                if (array[i] == (array[j])) {
                    Log.e("Mainc", "" + "Palindrome");
                    break;
                }
            }
        }*/
    }

    private void majorityElement(int[] array, int size) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < size; i++) {

            if (myMap.containsKey(array[i])) {

                int count = myMap.get(array[i]) + 1;

                if (count > array.length / 2) {
                    System.out.println("Majority found :- " + array[i]);
                    return;
                } else {
                    myMap.put(array[i], count);
                }
            } else {
                myMap.put(array[i], 1);
            }

            System.out.println(" No Majority element");
        }

    }

    static int numberOfPaths(int m, int n) {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1)
            return 1;

        // If diagonal movements are allowed then
        // the last addition is required.
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
        // + numberOfPaths(m-1, n-1);
    }

    // Function to check if the
    // Pythagorean triplet exists or not

    private boolean checkTriplet(int[] arr, int n) {
        int maximum = 0;
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, arr[i]);
        }

        int[] hash = new int[maximum + 1];

        // Increase the count of array elements
        // in hash table
        for (int i = 0; i < n; i++)
            hash[arr[i]]++;

        return false;
    }

    private void segregate0and1(int[] arr, int size) {
        /* Initialize left and right indexes */
        int left = 0, right = size - 1;

        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (arr[left] == 0 && left < right)
                left++;

            /* Decrement right index while we see 1 at right */
            while (arr[right] == 1 && left < right)
                right--;

            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    //Given an array A[] and a number x, check for pair in A[] with sum as x
    private boolean sumInArray(int[] a, int size, int x) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((a[i] + a[j]) == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean wordBreak(String str, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[str.length() + 1];
        dp[0] = true;

        for (int j = 1; j < dp.length; j++) {
            for (int i = 0; i < j; i++) {
                if (dp[i] && dict.contains(str.substring(i, j))) {
                    dp[j] = true;
                    break;
                }
            }
        }

        return dp[str.length()];
    }

    public List<String> wordBreak1(String str, List<String> dict, String out) {

        List<String> wordDictOutPut = new ArrayList<>();
        // if we have reached the end of the String,
        // print the output String
        if (str.length() == 0) {
            wordDictOutPut.add(out);
            System.out.println(wordDictOutPut);
        }

        for (int i = 1; i <= str.length(); i++) {
            // consider all prefixes of current String
            String prefix = str.substring(0, i);

            // if the prefix is present in the dictionary, add prefix to the
            // output String and recur for remaining String

            if (dict.contains(prefix)) {
                wordBreak1(str.substring(i), dict, out + " " + prefix);
            }
        }
        return wordDictOutPut;
    }

    public boolean dfs(String s, Set<String> set) {
        if (s.equals(""))
            return true;
        for (int i = 1; i < s.length(); i++) {
            if (set.contains(s.substring(0, i)) && dfs(s.substring(s.length()), set)) {
                return true;
            }
        }
        return false;
    }

    private void segregate012(int a[], int size) {
        int low = 0, high = size - 1, mid = 0;
        int temp = 0;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;

            }
        }

    }

    // Complete the jumpingOnClouds function below.
    private static int jumpingOnClouds(int[] c, int n) {
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            ans[i] = Integer.MAX_VALUE;
            if (c[i] == 1) {
                //do nothing
            } else {
                ans[i] = Math.min(ans[i], ans[i - 1]);
                if (i >= 2) {
                    ans[i] = Math.min(ans[i], ans[i - 2]);
                }
                ans[i]++;
            }
        }
        System.out.println(ans[n - 1]);
        return ans[n - 1];
    }

    private int countingValleys(int n, String a) {
        int track = 0, state = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == 'U')
                track++;
            if (a.charAt(i) == 'D')
                track--;
            if (track < 0)
                state = 1;
            if (state == 1 && track == 0) {
                ans++;
                state = 0;
            }

        }
        return ans;
    }

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(ar[i]))
                hashSet.add(ar[i]);
            else {
                pairs++;
                hashSet.remove(ar[i]);
            }
        }
        return pairs;
    }

    static int[] rotLeft(int[] a, int d, int n) {
        int i, temp;
        for (int j = 0; j < d; j++) {
            temp = a[0];
            for (i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[i] = temp;
        }
        return a;
    }

    int findMaxSum(int[][] mat) {
        int R = 5;
        int C = 5;
        if (R < 3 || C < 3)
            return -1;

        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                // Considering mat[i][j] as top
                // left cell of hour glass.
                int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2])
                        + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);

                // If previous sum is less then
                // current sum then update
                // new sum in max_sum
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;

    }

    /*Well, I created a temporary array (temp) to store the position (pos) of elements (val) in the original array (since they are consecutive).
    Then I referred to the positions in order to bring the original array into order:
    I looked for 1, and wherever that 1 is, I placed the element at index 0 of arr and then updated its new position in temp as well; looked for 2, wherever that 2 is, I placed the element at index 1 of arr and then updated its new position in temp... If any element is at its right place, I skipped else increased the swaps.*/
    private int minimumSwaps(int[] arr) {
        int[] temp = new int[largest(arr) + 1];

        for (int j = 0; j < arr.length; j++) {
            temp[arr[j]] = j;
        }
        int swaps = 0;
        int t;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                swaps += 1;
                t = arr[i];
                arr[i] = i + 1;
                arr[temp[i + 1]] = t;
                temp[t] = temp[i + 1];
            }
        }
        System.out.println(swaps);
        return swaps;
    }

    private int largest(int[] arr) {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    private void minimumBribes(int[] q) {
        int bribe = 0;
        boolean chaotic = false;
        int n = q.length;
        for (int i = 0; i < n; i++) {
            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        if (chaotic)
            //Console.("Too chaotic");
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
    }

    private String twoStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                Character c1 = s1.charAt(i);
                Character c2 = s2.charAt(j);
                if (c1.equals(c2)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    String twoStringsEffieinet(String s1, String s2) {
        int[] letters = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            //check if we have common chars
            letters[s2.charAt(i)]--;
            if (letters[s2.charAt(i)] > 0) {
                return "YES";
            }
        }
        return "NO";
    }

    private String checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : magazine) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else
                hm.put(s, 1);
        }

        boolean check = false;

        for (String s : note) {
            if (!hm.containsKey(s)) {
                check = true;
                break;
            } else {
                if (hm.get(s) > 1)
                    hm.put(s, hm.get(s) - 1);
                else
                    hm.remove(s);
            }
        }
        if (!check) return "YES";

            //System.out.println("Yes");
        else
            return "NO";
        //System.out.println("No");
    }

    private static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> potential = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i);
            long key = a / r;

            if (counter.containsKey(key) && a % r == 0) {
                count += counter.get(key);
            }

            if (potential.containsKey(key) && a % r == 0) {
                long c = potential.get(key);
                counter.put(a, counter.getOrDefault(a, 0L) + c);
            }

            potential.put(a, potential.getOrDefault(a, 0L) + 1); // Every number can be the start of a triplet.
        }
        return count;
    }

    /*private void sherlockAndAnagrams(String s) {

        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            String key = "";

            for (int j = i; j < s.length(); j++) {
                key = s.substring(i, j + 1);

                char[] x = key.toCharArray();
                Arrays.sort(x);

                key = String.valueOf(x);

                if (hash.containsKey(key)) {
                    Integer v = hash.get(key);
                    v = v + 1;
                    hash.put(key, v);
                } else {
                    Integer v = 0;
                    hash.put(key, v);
                }
            }
        }

        int count = 0;
        for (Map.Entry<String, Integer> it : hash.entrySet()) {
            if (it.getValue() > 0) {
                count = count + it.getValue();
            }
        }
        System.out.println(count);
    }*/

    private void sherlockAndAnagrams(String s) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            String key = "";

            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                char[] c = subString.toCharArray();
                Arrays.sort(c);
                key = String.valueOf(c);

                /*if (hashMap.containsKey(key)) {
                    hashMap.put(key, hashMap.get(key) + 1);
                } else {
                    hashMap.put(key, 0);
                }*/
                hashMap.put(key, 0);
            }
        }

        int count = 0;
        /*for (Map.Entry<String, Integer> it : hashMap.entrySet()) {
            if (it.getValue() > 0) {
                count = count + it.getValue();
            }
        }*/
        //Compare

        for (Map.Entry<String, Integer> entry1 : hashMap.entrySet()) {
            String key1 = entry1.getKey();
            int hash1 = System.identityHashCode(key1);

            //Integer value1 = entry1.getValue();

            for (Map.Entry<String, Integer> entry2 : hashMap.entrySet()) {
                String key2 = entry2.getKey();
                if (hash1 > System.identityHashCode(key2)) continue;

                Integer value2 = entry1.getValue();
                // compare value1 and value2;
            }
        }
        System.out.println(count);

    }

    public int[] twoSum(int[] nums, int target) {
        //Solution one
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");*/

        //Solution Two
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(target - nums[i]);
            if (hashMap.containsKey(temp)) {
                return new int[]{hashMap.get(temp), i};

            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public boolean isValid(String s) {
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put('}', '{');
        hashMap.put(']', '[');
        hashMap.put(')', '(');

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (hashMap.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != hashMap.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
