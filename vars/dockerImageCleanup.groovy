def call(String project, String ImageTag, String hubUser){
    
    sh """
     docker rmi ${hubUser}/${project}:${ImageTag}
     """
}


// // def call(String aws_account_id, String region, String ecr_repoName){
    
// //     sh """
//   docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
// //      docker rmi ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
// //     """
// // }
