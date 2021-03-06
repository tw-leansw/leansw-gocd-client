package com.thoughtworks.lean.gocd.dto.pipeline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "type")
public class ExecTaskAttributes implements TaskAttributes{

    @JsonProperty("run_if")
    List<String> runIf;

    String command;

    List<String> arguments;

    @JsonProperty("working_directory")
    String workingDirectory;

    @JsonProperty("on_cancel")
    Task onCancel;

    public ExecTaskAttributes() {
    }

    public List<String> getRunIf() {
        return runIf;
    }

    public ExecTaskAttributes setRunIf(List<String> runIf) {
        this.runIf = runIf;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public ExecTaskAttributes setCommand(String command) {
        this.command = command;
        return this;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public ExecTaskAttributes setArguments(List<String> arguments) {
        this.arguments = arguments;
        return this;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public ExecTaskAttributes setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }

    public Task getOnCancel() {
        return onCancel;
    }

    public ExecTaskAttributes setOnCancel(Task onCancel) {
        this.onCancel = onCancel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("runIf", runIf)
                .append("command", command)
                .append("arguments", arguments)
                .append("workingDirectory", workingDirectory)
                .append("onCancel", onCancel)
                .toString();
    }
}
