package com.testHr.dto;

import com.testHr.model.Resume;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zeng
 * @modified By:
 */
public class ResumeDTO {
    private String head;//信息头
    private String body;//信息体
    private boolean isSuccess = false;//是否成功
    private String returnfailMessage;//信息结果
    private Resume resume;
    private List<Resume> list = new ArrayList<>();

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getReturnfailMessage() {
        return returnfailMessage;
    }

    public void setReturnfailMessage(String returnfailMessage) {
        this.returnfailMessage = returnfailMessage;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public List<Resume> getList() {
        return list;
    }

    public void setList(List<Resume> list) {
        this.list = list;
    }

    public void showAllList() {
        System.out.println("----------------您的查询结果为：----------------");
        if (list != null && list.size() != 0) {//不为空且有内容
            for (Resume resume : list) {
                System.out.println(resume);
            }
        } else {
            System.out.println("没有查询信息");
        }
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public void showSomeList() {
        System.out.println("----------------您的查询结果为：----------------");
        if (list != null && list.size() != 0) {
            for (Resume resume : list) {
                System.out.println("Resume{" +
                        "name='" + resume.getName() + '\'' +
                        ", id=" + resume.getId() +
                        ", school='" + resume.getSchool() + '\'' +
                        ", process=" + resume.getProcess() +
                        '}');
            }
        } else {
            System.out.println("没有查询信息");
        }
        System.out.println("-------------------------------------------------");
        System.out.println();
    }
}
