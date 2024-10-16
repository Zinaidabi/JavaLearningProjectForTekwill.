package md.tekwill.gitworkflow;

public class GitWorkFlow {

    public static void main(String[] args) {

       String step1 = "Open Intellij IDEA and navigate to master branch - git checkout master";
       String step2 = "Open the terminal and execute the - git fetch - command to make sure there are some changes on cloud, but not download them";
       String step3 = "Execute the command - git pull - that will download the changes from origin/master to local master branch";
       String step4 = "Create a new branch and move to it - git checkout -b task_1 - it will redirect us to task_1 branch";

            // As result, there a two branches on the local memory: master and task_1, and on the cloud memory we have only one branch: origin/master

       String step5 = "Add the changes related to the task_1, being on the task_1 branch";
       String step6 = "Add the changes on the history on the local branch task_1 - git commit";
       String step7 = "Execute the command - git push - as result, there is created a new branch on GitHub called origin/task_1";

            // As result, there are two branches on local memory and 2 branches on cloud memory - origin/master & origin/task_1

       String step8 = "Create a pull request from  source origin task_1 to origin/master - make sure you add the reviewers";
       String step9 = "If there are no comments and the code is approved (changes), then we merge the code";

            // As result, the origin/master will have the latest code that was previously added in the origin/main

       String step10 = "Go back to Intellij IDEA where we are on task_1 branch, and move to master - git checkout master";
       String step11 = "Execute the commands git fetch and git pull to download the latest changes that were added to origin/master";

       System.out.println(step1);
       System.out.println(step2);
       System.out.println(step3);
       System.out.println(step4);
       System.out.println(step5);
       System.out.println(step6);
       System.out.println(step7);
       System.out.println(step9);
       System.out.println(step10);
       System.out.println(step11);
    }
}
