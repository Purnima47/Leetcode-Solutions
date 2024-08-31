var isValid = function (s) {
    let st = [];

    for (let i = 0; i < s.length; i++) {
        let ch = s.charAt(i);

        if (ch == '(' || ch == '{' || ch == '[') {
            st.push(ch);
        }
        else {
            if (st.length == 0) {
                return false;
            }

            if ((st[st.length - 1] == '(' && ch == ')') || (st[st.length - 1] == '{' && ch == '}') || (st[st.length - 1] == '[' && ch == ']')) {
                st.pop();
            } else {
                return false;
            }
        }
    }

    if (st.length == 0)
        return true;
    else
        return false;
};