/*
 * Copyright (C) 2007-2021 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.studio.permissions;

public final class StudioPermissionsConstants {

    // TODO: find better way
    //  All values are lower case (configuration has mixed case)
    public static final String ACTION_ADD_REMOTE = "add_remote";
    public static final String ACTION_AUDIT_LOG = "audit_log";
    public static final String ACTION_CANCEL_FAILED_PULL = "cancel_failed_pull";
    public static final String ACTION_CANCEL_PUBLISH = "cancel_publish";
    public static final String ACTION_CHANGE_CONTENT_TYPE = "change content type";
    public static final String ACTION_CLONE_CONTENT_CMIS = "clone_content_cmis";
    public static final String ACTION_COMMIT_RESOLUTION = "commit_resolution";
    public static final String ACTION_CREATE_CONTENT = "create content";
    public static final String ACTION_CREATE_FOLDER = "create folder";
    public static final String ACTION_CREATE_CLUSTER = "create_cluster";
    public static final String ACTION_CREATE_GROUPS = "create_groups";
    public static final String ACTION_CREATE_USERS = "create_users";
    public static final String ACTION_CREATE_SITE = "create-site";
    public static final String ACTION_DELETE = "delete";
    public static final String ACTION_DELETE_CLUSTER = "delete_cluster";
    public static final String ACTION_DELETE_CONTENT = "delete_content";
    public static final String ACTION_DELETE_GROUPS = "delete_groups";
    public static final String ACTION_DELETE_USERS = "delete_users";
    public static final String ACTION_EDIT_SITE = "edit_site";
    public static final String ACTION_ENCRYPTION_TOOL = "encryption_tool";
    public static final String ACTION_GET_CHILDREN = "get_children";
    public static final String ACTION_GET_PUBLISHING_QUEUE = "get_publishing_queue";
    public static final String ACTION_LIST_CMIS = "list_cmis";
    public static final String ACTION_LIST_REMOTES = "list_remotes";
    public static final String ACTION_PUBLISH = "publish";
    public static final String ACTION_PULL_FROM_REMOTE = "pull_from_remote";
    public static final String ACTION_PUSH_TO_REMOTE = "push_to_remote";
    public static final String ACTION_READ = "read";
    public static final String ACTION_READ_CLUSTER = "read_cluster";
    public static final String ACTION_READ_GROUPS = "read_groups";
    public static final String ACTION_READ_LOGS = "read_logs";
    public static final String ACTION_READ_USERS = "read_users";
    public static final String ACTION_REBUILD_DATABASE = "rebuild_database";
    public static final String ACTION_REMOVE_REMOTE = "remove_remote";
    public static final String ACTION_RESOLVE_CONFLICT = "resolve_conflict";
    public static final String ACTION_S3_READ = "s3 read";
    public static final String ACTION_S3_WRITE = "s3 write";
    public static final String ACTION_SEARCH_CMIS = "search_cmis";
    public static final String ACTION_SITE_DIFF_CONFLICTED_FILE = "site_diff_conflicted_file";
    public static final String ACTION_SITE_STATUS = "site_status";
    public static final String ACTION_UPDATE_CLUSTER = "update_cluster";
    public static final String ACTION_UPDATE_GROUPS = "update_groups";
    public static final String ACTION_UPDATE_USERS = "update_users";
    public static final String ACTION_UPLOAD_CONTENT_CMIS = "upload_content_cmis";
    public static final String ACTION_WEBDAV_READ = "webdav_read";
    public static final String ACTION_WEBDAV_WRITE = "webdav_write";
    public static final String ACTION_WRITE = "write";
    public static final String ACTION_WRITE_CONFIGURATION = "write_configuration";
    public static final String ACTION_WRITE_GLOBAL_CONFIGURATION = "write_global_configuration";
    public static final String ACTION_LIST_PLUGINS = "list_plugins";
    public static final String ACTION_INSTALL_PLUGINS = "install_plugins";

    private StudioPermissionsConstants() {
    }
}
