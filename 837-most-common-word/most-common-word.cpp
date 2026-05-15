class Solution {
public:
    string mostCommonWord(string paragraph, vector<string>& banned) {

        unordered_set<string> ban(banned.begin(), banned.end());
        unordered_map<string,int> mp;

        string w, ans;
        int mx = 0;

        paragraph += ' ';

        for(char &c : paragraph) {

            if(isalpha(c)) {

                w += tolower(c);

            } else if(!w.empty()) {

                if(!ban.count(w)) {

                    if(++mp[w] > mx) {
                        mx = mp[w];
                        ans = w;
                    }
                }

                w.clear();
            }
        }

        return ans;
    }
};