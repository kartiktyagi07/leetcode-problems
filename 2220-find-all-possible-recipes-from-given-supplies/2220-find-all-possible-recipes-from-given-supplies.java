class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        ArrayList<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String z : supplies) {
            set.add(z);
        }
        boolean added = true;
        while (added) {
            added = false;
            for (int i = 0; i < recipes.length; i++) {
                if (set.contains(recipes[i]))
                    continue;
                boolean canMake = true;
                for (String ingre : ingredients.get(i)) {
                    if (!set.contains(ingre)) {
                        canMake = false;
                        break;
                    }
                }
                if (canMake) {
                    ans.add(recipes[i]);
                    set.add(recipes[i]);
                    added = true;
                }
            }
        }
        return ans;
    }
}