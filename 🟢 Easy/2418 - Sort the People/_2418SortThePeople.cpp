class People {
public:
    string name;
    int height;

    People(string name, int height) : name(name), height(height) {}

    static bool heightComparator(People p1, People p2) {
        return p2.height < p1.height;
    }
};

class Solution {

public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        std::vector<People> nameHeight;
        for (int i = 0; i < names.size(); i++) {
            nameHeight.push_back({names[i], heights[i]});
        }

        sort(nameHeight.begin(), nameHeight.end(), People::heightComparator);

        int i = 0;
        for (People sortedName : nameHeight) {
            names[i++] = sortedName.name;
        }

        return names;
    }
};