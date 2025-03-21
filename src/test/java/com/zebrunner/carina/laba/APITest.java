package com.zebrunner.carina.laba;

import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.laba.api.*;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITest  implements IAbstractTest {
    @Test
    public void testGetPosts() {
        GetPostsMethod getPostsMethod = new GetPostsMethod();
        getPostsMethod.callAPIExpectSuccess();
        getPostsMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetPost() {
        GetPostMethod getPostMethod = new GetPostMethod(1);
        getPostMethod.callAPIExpectSuccess();
        getPostMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetComments() {
        GetCommentsMethod getCommentsMethod = new GetCommentsMethod();
        getCommentsMethod.callAPIExpectSuccess();
        getCommentsMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetComment() {
        GetCommentMethod getCommentMethod = new GetCommentMethod(1);
        getCommentMethod.callAPIExpectSuccess();
        getCommentMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetCompanies() {
        GetCompaniesMethod getCompaniesMethod = new GetCompaniesMethod();
        getCompaniesMethod.callAPIExpectSuccess();
        getCompaniesMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetCompany() {
        GetCompanyMethod getCompanyMethod = new GetCompanyMethod(1);
        getCompanyMethod.callAPIExpectSuccess();
        getCompanyMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetUsers() {
        GetUsersMethod getUsersMethod = new GetUsersMethod();
        getUsersMethod.callAPIExpectSuccess();
        getUsersMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetUser() {
        GetUserMethod getUserMethod = new GetUserMethod(1);
        getUserMethod.callAPIExpectSuccess();
        getUserMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetRoles() {
        GetRolesMethod getRolesMethod = new GetRolesMethod();
        getRolesMethod.callAPIExpectSuccess();
        getRolesMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetRole() {
        GetRoleMethod getRoleMethod = new GetRoleMethod(1);
        getRoleMethod.callAPIExpectSuccess();
        getRoleMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }
}
