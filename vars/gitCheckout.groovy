def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[branchname:  stageParams.branch ]],
        userRemoteConfigs: [[ branchurl: stageParams.url ]]
    ])
  }