import React from 'react'
import AvatarComponent from '.'
import { ComponentMeta, ComponentStory } from '@storybook/react'

export default {
    title: 'atoms/Avatar',
    component: AvatarComponent,
} as ComponentMeta<typeof AvatarComponent>;

const Template: ComponentStory<typeof AvatarComponent> = (args) => (
    <AvatarComponent {...args} />
); 

export const avatar = Template.bind({});
avatar.args = {
    src: 'https://mui.com/static/images/avatar/2.jpg',
    alt: 'Avatar not found',
}

