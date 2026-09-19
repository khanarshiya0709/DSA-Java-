class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> temp = new ArrayList<>();
            long curr = 1;

            temp.add(1);

            for (int col = 1; col < row; col++) {
                curr = curr * (row - col + 1);
                curr = curr / col;

                temp.add((int) curr);
            }

            if (row > 0) {
                temp.add(1);
            }

            result.add(temp);
        }

        return result;
    }
}