load("@rules_java//java:defs.bzl", "java_binary")

java_plugin(
    name = "nullness_checker",
    processor_class = "org.checkerframework.checker.nullness.NullnessChecker",
    deps = ["@maven//:org_checkerframework_checker"],
)

java_binary(
    name = "hello_world",
    srcs = glob(["*.java"]),
    main_class = "com.example.hello_world.Main",
    plugins = [":nullness_checker"],
    visibility = ["//visibility:public"],
    deps = ["@maven//:org_checkerframework_checker_qual"],
)

java_plugin(
    name = "nullness_checker_old",
    processor_class = "org.checkerframework.checker.nullness.NullnessChecker",
    deps = ["@maven_old//:org_checkerframework_checker"],
)

java_binary(
    name = "hello_world_old",
    srcs = glob(["*.java"]),
    main_class = "com.example.hello_world.Main",
    plugins = [":nullness_checker_old"],
    visibility = ["//visibility:public"],
    deps = ["@maven_old//:org_checkerframework_checker_qual"],
)
