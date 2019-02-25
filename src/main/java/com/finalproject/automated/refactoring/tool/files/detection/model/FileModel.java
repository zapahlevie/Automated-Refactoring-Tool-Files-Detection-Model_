package com.finalproject.automated.refactoring.tool.files.detection.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileModel {

    private String path;

    private String filename;

    private String content;
}
