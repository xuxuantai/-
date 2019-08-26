package huawei;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String FirstPerson = scanner.nextLine();
            int n = Integer.valueOf(scanner.nextLine());
            ArrayList<HashSet<String>> membersList = new ArrayList<HashSet<String>>();

            for (int i = 0; i < n; i++) {
                String[] membersStr = scanner.nextLine().split(",");
                HashSet<String> members = new HashSet<>(Arrays.asList(membersStr));
                membersList.add(members);
            }


            ArrayList<String> knowedPersons = new ArrayList<String>();
            knowedPersons.add(FirstPerson);


            for (int i = 0; i < n; i++) {
                HashSet<String> thisMembers = membersList.get(i);
                int membersLen = thisMembers.size();
                for (int j = 0; j < knowedPersons.size(); j++) {
                    if(thisMembers.contains(knowedPersons.get(j))){
                        //循环所有KnowedPersons，如果该群有已知消息的人，则该群所有人纳入KnowedPersons
                        for (String s : thisMembers) {
                            if(knowedPersons.contains(s)){
                                //已存在于knowedPersons的就不再添加了
                                continue;
                            }
                            knowedPersons.add(s);
                        }
                        break;
                    }
                }
            }
            int result = knowedPersons.size();
            System.out.println(result);


        }

    }

}
