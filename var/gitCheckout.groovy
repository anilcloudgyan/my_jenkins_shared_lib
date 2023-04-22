def call (Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]]
        remotUrl: [[url: stageParams.url]]
    ])
}

