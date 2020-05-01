package testpractise;
//Kth Candy Question

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import static java.lang.Math.abs;

    public class Kth {
        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String sweetnessSize = br.readLine();             //5

                Scanner s = new Scanner(System.in);
                String sweetnessString = s.nextLine();            // 2 5 4 7 3

                String queryCount = s.nextLine();                 // 3 3


                List<Integer> queryTimesInteger = Arrays.stream(queryCount.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                List<Integer> sweetnessList = Arrays.stream(sweetnessString.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

                //Drill Down
                int timesToDrill = queryTimesInteger.get(0);
                for (int count = timesToDrill ; count > 0 ; count--){

                    String query = s.nextLine(); // 4 8 2
                    List<Integer> sweetnessListQuery = Arrays.stream(query.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

                    int updateIndex = sweetnessListQuery.get(0) - 1;
                    int updatedSweetness = sweetnessListQuery.get(1);
                    int kthSweetness = sweetnessListQuery.get(2) - 1;
                    sweetnessList.set(updateIndex, updatedSweetness);

                    //Find Kth Sweetest Candy
                    List<Integer> copiedSweetnessList = new ArrayList<>();
                    for(Integer sweetness : sweetnessList) {
                        copiedSweetnessList.add(sweetness);
                    }
                    Collections.sort(copiedSweetnessList);

                    System.out.println(copiedSweetnessList.get(kthSweetness) + " ");


                }





            }

        }



