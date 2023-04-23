def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[nameb:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }