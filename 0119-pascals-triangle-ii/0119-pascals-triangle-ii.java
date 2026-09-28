class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ansList = new ArrayList<>();

        long ans = 1;

        ansList.add((int) ans);

        for (int i = 1; i <= rowIndex; i++) {

            ans = ans * (rowIndex - i + 1);
            ans = ans / i;

            ansList.add((int) ans);
        }

        return ansList;
    }
}