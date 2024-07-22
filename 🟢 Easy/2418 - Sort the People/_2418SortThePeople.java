class Solution {

    class People {
        String name;
        int height;

        People(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }

    class HeightComparator implements Comparator<People> {
        public int compare(People p1, People p2) {
            return p2.height - p1.height;
        }
    }

    public String[] sortPeople(String[] names, int[] heights) {
        ArrayList<People> nameHeight = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            nameHeight.add(new People(names[i], heights[i]));
        }

        Collections.sort(nameHeight, new HeightComparator());

        int i = 0;
        for (People sortedName : nameHeight) {
            names[i++] = sortedName.name;
        }

        return names;

    }

}