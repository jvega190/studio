/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
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
package org.craftercms.studio.impl.v2.security.authentication.headers;

import org.springframework.security.authentication.AbstractAuthenticationToken;

/**
 * Extension of {@link AbstractAuthenticationToken} used for Studio's header authentication.
 *
 * @author joseross
 * @since 3.2
 */
public class HeadersAuthenticationToken extends AbstractAuthenticationToken {

    private Object principal;

    public HeadersAuthenticationToken(Object principal) {
        super(null);
        this.principal = principal;
        setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return "N/A";
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }

}
