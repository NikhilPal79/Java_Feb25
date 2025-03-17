package MAR6;

public class GIT {
    public static void main(String[] args) {

    }

    /*
    BRANCHING

    ONE FEATURES

    MAIN -----------------------------------------------------------------------> PRODUCTION(END USER OR CUSTOMER )

MAIN TO STAGING( )           AND STAGING TO MAIN ()


    STAGING -----------------------------------------------------------------------> PRE-PRODUCTION


STAGING TO FEATURE()                   AND FEATURE TO STAGING(MERGED BACK TO STAGING)


    FEATURES --------------------------------------------------------------------->


    FEATURES TO DEVELOP(MERGE AND THEN TEST IT)


    DEVELOP------------------------------------------------------------------------> QA/TEST


     */
    /*
    commit ?
snapshot of code respository at that point in time

how to check the previous git commits ? git log

git remote -v --- to check the current remote origin

remote - github vs local - local system / intelliJ/ terminal /git

Branch

what is a branch ?

pointer to a specific commit

main ----- affect this codebase at all | | copy to a new place and modify that thing

one feature

git branch branch_name

command
to create and switch the branch at the same time git checkout -b branch_name

main -
staging -
feature

git branch branch_name

git checkout branch_name

git checkout -b branch_name

one feature

git branch branch_name

9c20a408fd970e4e57efdf24cb6255ebc5d6eba4 - feature - 2 more commits that stagin b711dfe0e48b4d3ada0f765cc7402b1966510757 - feature

77f3b870cb3df78d91c5f072d04fc55b5abd13a6 - feature

77f3b870cb3df78d91c5f072d04fc55b5abd13a6 - staging

77f3b870cb3df78d91c5f072d04fc55b5abd13a6 - main

-- added manually from github

git pull
to fetch the remote changes to the local branch

Pull Request [PR] , git bash - merge request
main - LOCKED staging - LOCKED feature

ask our teammates to approve our code before it can be merged to staging/main
     */
    
}
