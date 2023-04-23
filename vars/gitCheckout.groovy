def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[namebranch:  stageParams.branch ]],
        userRemoteConfigs: [[ urlbranch: stageParams.url ]]
    ])
  }