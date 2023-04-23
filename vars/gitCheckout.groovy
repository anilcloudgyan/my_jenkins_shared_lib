def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branchesAnil: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }